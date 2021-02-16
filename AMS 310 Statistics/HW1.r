#1
tmp_high = c(38, 42, 50, 61, 71, 79, 84, 83, 75, 64, 54, 43)
tmp_low = c(27, 29, 35, 45, 54, 64, 69, 68, 61, 50, 42, 28)

ts_high = ts(tmp_high)
ts_low = ts(tmp_low)

boxplot(tmp_high, tmp_low)

var(tmp_low)
sd(tmp_low)
#2
(19*5+20*2+21*11+22*9+23*13+24*15+25*13+26*12+27*10+28*8+29*2)/100

sqrt( ( ((19-24.12)^2 * 5)+((20-24.12)^2 * 2)+((21-24.12)^2 * 11)+((22-24.12)^2 * 9)+((23-24.12)^2 * 13)+((24-24.12)^2 * 15)+((25-24.12)^2 * 13)+((26-24.12)^2 * 12)+((27-24.12)^2 * 10)+((28-24.12)^2 * 8)+((29-24.12)^2 * 2) )/99)

#3
three_raw = c(29, 33, 38, 43, 46, 48, 48, 51, 51, 56, 61, 64, 66, 67, 68, 77, 78, 78, 79, 82, 83, 84, 85, 85, 86, 86, 89, 89, 90, 90, 91, 93, 94, 97, 100)

median(three_raw)
quantile(three_raw, 0.8)

#4
defect_frequency = c(45, 67, 21, 25, 9, 18, 6, 2)
names(defect_frequency) = c("Wrong Supplier", "Excess Count", "Too Few Count", "Wrong Size", "Wrong Sterile Instrument", "Wrong Sterile Instrument Set", "Missing Item", "Damaged Item", "Other")

pareto.chart(defect_frequency, xlab="Error Type", ylab="Frequency")

#5
sample(1:200, 20)
sample(50:150, 25)
sample(40:120, 25)

sample1 = c(121, 133, 140,  93,  56,  17, 191,  36,  74, 161, 151, 165,  33, 158, 155, 162, 157, 148, 154,  15)
sample2 = c(86, 109,  95,  52,  94, 139, 131, 129, 122, 135,  62, 123, 138, 128, 116,  97, 120, 150, 60,  57,  65, 134, 146, 111, 140)
sample3 = c(85, 46,  58, 105,  41, 109,  94, 112,  88,  79, 107,  60,  61,  95,  49,  56,  75,  78, 68,  54,  80,  53,  55,  64,  42)

boxplot(sample1, sample2, sample3)


#6
raw6 = c(55, 61, 94, 94, 69, 77, 68, 54, 85, 77, 92, 92, 81, 73, 69, 81, 75, 84, 70, 81, 81, 89, 59, 72, 82, 62)

hist(raw6)

mean(raw6)
var(raw6)

min(raw6)
max(raw6)
quantile(raw6, 0.25)
median(raw6)
quantile(raw6, 0.75)

boxplot(raw6)

