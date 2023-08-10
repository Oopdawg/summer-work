num = (input("Enter a number: ")).upper()
start_base = int(input("Enter starting base: "))
end_base = int(input("Enter ending base: "))

digit_to_value = {str(i) : i for i in range(0, 10)}
digit_to_value.update({chr(ascii) : ascii-ord('A')+10 for ascii in range(ord('A'), ord('Z')+1)})

# for i in range(0, 10):
#     digit_to_value[str(i)] = i
# for ascii in range(ord('A'), ord('Z')+1):
#     digit_to_value[chr(ascii)] = ascii-ord('A')+10


# inverse of the other dictionary using dictionary comprehension
value_to_digit = {v:k for k,v in digit_to_value.items()}


# converts number to the end base
end_digits = []
quotient = int(num, base=start_base) # converts number to base 10
while quotient or not end_digits: # runs the first time as endDigits is empty
    quotient, remainder = divmod(quotient, end_base) # divmod allows to operate first on numBase10 and then on the remainders
    end_digits.append(remainder)
end_digits.reverse()


output = ''.join([value_to_digit[i] for i in end_digits]) # similar to list comprehension
print(output)