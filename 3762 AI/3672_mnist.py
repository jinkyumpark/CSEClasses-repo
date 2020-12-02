import numpy as np
import matplotlib.pyplot as plt
from keras.models import Sequential
from keras.layers import Dense, Activation
from keras.utils import np_utils
from keras.datasets import mnist
import imageio

tmp = mnist.load_data()
x_train, y_train = tmp[0]
x_test, y_test = tmp[1]

fig = plt.figure()
for i in range(20):
    subplot = fig.add_subplot(4,5, i+1)
    subplot.imshow(x_train[i,:,:])
plt.show()

#organize data
n_class = 10
n_train, nx, ny = x_train.shape
n_test, nx, ny = x_test.shape
x_train = x_train.astype('float32')/255
x_test = x_test.astype('float32')/255
y_train = np_utils.to_categorical(y_train, n_class)
y_test = np_utils.to_categorical(y_test, n_class)
x_train = x_train.reshape(n_train, nx*ny)
x_test = x_test.reshape(n_test, nx*ny)

model = Sequential()
model.add(Dense(n_class, input_dim = nx*ny, activation='sigmoid'))
model.summary()

model.compile(loss='categorical_crossentropy', optimizer='adam', metrics=['accuracy'])

H = model.fit(x_train, y_train, batch_size = 50, epochs = 10)

plt.figure()
plt.plot(H.history['loss'])
plt.show()

score = model.evaluate(x_test, y_test)
print('Acc= ', score)

im = imageio.imread('image2.jpg')
im2 = 1-im.astype('float32')/255
plt.figure()
plt.imshow(im2[:,:,1])
plt.show()
tt = im2[:,:,1]
im3 = tt.reshape((1,nx*ny))

rst = model.predict(im3)
for i in range(10):
    print('i', rst[0, i])
