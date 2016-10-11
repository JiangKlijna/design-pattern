# encoding = utf-8

import os

class Command(object):

    def execute(self):
        self()

    def __call__(self):
        pass

    def undo(self):
        pass

class MoveFileCommand(Command):
    def __init__(self, src, dest):
        self.src = src
        self.dest = dest

    def __call__(self):
        print('renaming {} to {}'.format(self.src, self.dest))
        os.rename(self.src, self.dest)

    def undo(self):
        print('renaming {} to {}'.format(self.dest, self.src))
        os.rename(self.dest, self.src)


if __name__ == "__main__":
    open('f1.txt', 'w').close()
    open('f3.txt', 'w').close()

    command_stack = []

    # commands are just pushed into the command stack
    command_stack.append(MoveFileCommand('f1.txt', 'f2.txt'))
    command_stack.append(MoveFileCommand('f3.txt', 'f4.txt'))


    # they can be executed later on
    for cmd in command_stack:
        cmd.execute()

    # and can also be undone at will
    for cmd in reversed(command_stack):
        cmd.undo()
