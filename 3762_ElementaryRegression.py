#Create quadratic function and add normally distributed noise
#Using basic linear regression to predict original Graph

import numpy as np
import matplotlib.pyplot as plt

#Original Data
n = 100
x = np.linspace(-1, 1, n)
f = 2 + x + 2 * x ** 2

#Data with noise
fn = f + np.random.normal(0, 0.1, n)

#Using part of the data to plot assumed shape of the graph
n0 = 80
a = np.zeros((n, 3))
b = np.zeros(n)
for i in range(n):
	a[i, 0] = x[i]**2
	a[i, 1] = x[i]
	a[i, 2] = 1
	b[i] = fn[i]

#Using listsq method to predict
z = np.linalg.lstsq(a[:n0, :], b[:n0], rcond=None)

#calculate predicted value and plot it
prd = np.matmul(a[:, :], z[0])

#Plot original, noise, predicted
plt.figure()
plt.plot(x[:], b[:], 'r')
plt.plot(x[:], prd, 'b')
plt.plot(x[:], f, 'y')
plt.show()
