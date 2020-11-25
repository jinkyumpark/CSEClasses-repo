import numpy as np
import matplotlib.pyplot as plt
import sklearn
from sklearn import datasets
from keras import optimizers
from keras.layers import Dense, Activation
from keras.models import Sequential

boston = datasets.load_boston()
a = boston.datasets
b = boston.target

nr, nc = a.shape

n0 = 400
x_train = a[:n0, :]
y_trian = b[:n0]

model = Sequntial()
model.add(Dense(5, input_dim=nc, activation='relu'))
model.add(Dense(4, activation='relu'))
model.add(Dense(2, activation='relu'))
model.add(Dense(1))
model.summary()

model.compile(loss='mse', optimizer='adam', metrics=['accuracy'])

H = model.fit(x_train, y_train, batch_size=30, epochs=1500)

plt.figure()
plt.plot(H.history['loss'])

y_predict = model.predict(a[:, :])
plt.figure()
plt.plot(b[:], 'g')
plt.plot(y_predict, 'r')
plt.show()
