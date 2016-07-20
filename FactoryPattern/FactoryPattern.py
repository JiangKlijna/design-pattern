# encoding = utf-8
# @author jiang

class GreekGetter:
	def get(self, msgid):
		return msgid[::-1]

class EnglishGetter:
	def get(self, msgid):
		return msgid[:]


def get_localizer(language="English"):
    languages = dict(English=EnglishGetter, Greek=GreekGetter)
    return languages[language]()

# Create our localizers
e, g = get_localizer("English"), get_localizer("Greek")
# Localize some text
print([(e.get(msgid), g.get(msgid)) for msgid in "dog parrot cat bear".split()])
