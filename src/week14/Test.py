print("this work?")
'''
name: BurnOut
what it holds: ducksToGive, exams 

class Complex:
    def __init__(self, realpart, imagpart):
        self.r = realpart
        self.i = imagpart

x = Complex(3.0, -4.5)
x.r, x.i

consequences method that adds 1 to ducksToGive
'''
class BurnOut:
    def __init__(self,exams):
        self.ducksToGive=0
        self.exams=exams
    def __str__(self):
        self.daysLeft=10
        return "exams: "+str(b1.exams)+" ducks to give:"+str(b1.ducksToGive)
    def consequences(self):
        self.ducksToGive+=1

class DoneFor(BurnOut):
    def __init__(self,exams):
        self.examsFailed=0
        super().__init__(exams)
    def __str__(self):
        out=super().__str__()
        return out+" exams failed: "+str(self.examsFailed)
    def iDontKnow(self):
        print("got me")

b1=BurnOut(4)
print("exams: "+str(b1.exams)+" ducks to give:"+str(b1.ducksToGive))
b1.consequences()
print(b1)
print(b1.daysLeft)
d1=DoneFor(3)
print(d1)
d1.iDontKnow()