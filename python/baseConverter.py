num = (input("Enter a number: ")).upper()
startBase = int(input("Enter starting base: "))
endBase = int(input("Enter ending base: "))

digitToValue = {}
for i in range(0, 10):
    digitToValue[str(i)] = i
for ascii in range(ord('A'), ord('Z')+1):
    digitToValue[chr(ascii)] = ascii-ord('A')+10


valueToDigit = {v:k for k,v in digitToValue.items()}

digits = [c for c in num]
digits.reverse()


numBase10 = 0
for e, digit in enumerate(digits):
    numBase10 += digitToValue[digit]*startBase**e

endDigits = []
quotient = numBase10//endBase
remainder = numBase10%endBase
endDigits.append(remainder)

while quotient != 0:
    remainder = quotient%endBase
    quotient //= endBase
    endDigits.append(remainder)
endDigits.reverse()

output = ''
for i in endDigits:
    output += valueToDigit[i]

print(output)