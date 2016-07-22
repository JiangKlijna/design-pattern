# encoding = utf-8
# @author jiang

import time
import threading

SLEEP = 0.5


# Complex Parts
class TC1(threading.Thread):
    def __init__(self):
        super(TC1, self).__init__()

    def run(self):
        print("###### In Test 1 ######")
        time.sleep(SLEEP)
        print("Setting up")
        time.sleep(SLEEP)
        print("Running test")
        time.sleep(SLEEP)
        print("Tearing down")
        time.sleep(SLEEP)
        print("Test Finished\n")


class TC2(threading.Thread):
    def __init__(self):
        super(TC2, self).__init__()

    def run(self):
        print("###### In Test 2 ######")
        time.sleep(SLEEP)
        print("Setting up")
        time.sleep(SLEEP)
        print("Running test")
        time.sleep(SLEEP)
        print("Tearing down")
        time.sleep(SLEEP)
        print("Test Finished\n")


class TC3(threading.Thread):
    def __init__(self):
        super(TC3, self).__init__()

    def run(self):
        print("###### In Test 3 ######")
        time.sleep(SLEEP)
        print("Setting up")
        time.sleep(SLEEP)
        print("Running test")
        time.sleep(SLEEP)
        print("Tearing down")
        time.sleep(SLEEP)
        print("Test Finished\n")


# Facade
class TestRunner:
    def __init__(self):
        self.tcs = [TC1, TC2, TC3]
        self.tests = [e() for e in self.tcs]

    def runAll(self):
        [i.start() for i in self.tests]

# Client
if __name__ == '__main__':
    testrunner = TestRunner()
    testrunner.runAll()
