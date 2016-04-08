#@author jiang
 
class Color:
	def draw(self):
		pass

class Red(Color):
	def draw(self):
		print("Red::draw() method")

class Green(Color):
	def draw(self):
		print("Green::draw() method")

class Blue(Color):
	def draw(self):
		print("Blue::draw() method")


class ShapeFactory:

	@staticmethod
	def getColor(type) :
		if type == "Red":
			return Red()
		elif type == "Green":
			return Green()
		elif type == "Blue":
			return Blue()
		else:
			return Color()

ShapeFactory.getColor("Red").draw()
ShapeFactory.getColor("Green").draw()
ShapeFactory.getColor("Blue").draw()
ShapeFactory.getColor("asd").draw()