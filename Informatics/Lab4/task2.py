import re

file = open("Macbeth.txt")
test_str = file.read()
file.close()
regex = '[!?.;]{0,}([^!?.;]*,){2,}[^!?.;]{1,}[!?.;]'
matches = re.finditer(regex, test_str)
for matchNum, match in enumerate(matches, start=1):
    print("{matchNum} : {match}".format(matchNum=matchNum, match=match.group()))
