hist(iris$Sepal.Length)

hist(iris$Sepal.Width)
hist(iris$Petal.Length)

#Pie Chart
pie(table(iris$species))

midterm = c(30, 34, 38, 44, 45, 46, 47, 48, 50, 50, 51, 52, 53, 53, 53, 54)

#Histogram
hist(midterm)

#Stem and Leaf Plots
a = c(55, 61, 94, 94, 69, 77, 68, 54, 85, 77, 92, 92, 81, 73, 69, 81,
      75, 84, 70, 81, 81, 89, 59, 72, 82, 62)

stem(a)

stem(iris$Sepal.Length, scale=0.5)

#Box Plot
b = c(78, 99, 47, 53, 71, 69, 60, 57, 45, 88)

boxplot(a, b)

boxplot(Sepal.Width~species, data=iris)

#Basic Statistical Function

#Mean
mean(a)
#Variance
var(a)
#Standard Deviation
sd(a)
min(a)
max(a)
#pth Percentile
quantile(a, 0.5)

quantile(iris$Sepal.Length, 0.75)
