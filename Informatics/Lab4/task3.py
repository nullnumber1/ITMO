import re

test_str = "кривошеее существо гуляет по парку"  # гуляет
# test_str = "кривошеее существо гуляет попопопо парку" # Empty output
# test_str = "кривошеее существо гулят по парку" # Empty output
# test_str = "отчисление по собственному желанию это выход" # отчисление; желанию
# test_str = "пятый тест, на котором моя фантазия уже совсем на исходе"  # фантазия
regex = '[а-я]*[бвгджзйклмнпрстфхцчшщ][аеёиоуэюяы][аеёиоуэюяы][^аеёиоуэюяы]* ([бвгджзйклмнпрстфхцчшщ]*[аеёиоуэюяы][бвгджзйклмнпрстфхцчшщь]*){1,3}([ ]|$)'
matches = re.finditer(regex, test_str)
for matchNum, match in enumerate(matches, start=1):
    print("{matchNum} : {match}".format(matchNum=matchNum, match=match.group().split(" ")[0]))
