import math

D, h, w = map(int,input().split())

pythagoras = ((h * h) + (w * w)) ** 0.5
t = D / pythagoras

real_h = h * t
real_w = w * t

print(math.floor(real_h), math.floor(real_w))

