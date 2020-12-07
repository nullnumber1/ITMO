import re


class Timetable:
    def __init__(self, subjects):
        self.subjects = subjects


class TimetableParser:
    def parser(self, line, subject):
        line = str(line).replace('"', "")
        line = str(line).replace(">", "")
        x = line.split("=")
        key = x[0]
        word = x[1].replace("\n", "")
        if key == "day":
            subject.day = word
        elif key == "time":
            subject.time = x[1].replace("\n", "") + ":" + x[2].replace("\n", "") + ":" + x[3].replace("\n", "")
        elif key == "room":
            subject.room = eval(word)
        elif key == "lesson":
            subject.lesson = word
        elif key == "teacher":
            subject.teacher = word
        elif key == "location":
            subject.location = word
        elif key == "parity":
            subject.parity = word
        return subject

    def run(self, file):
        lines = file.readlines()
        subjects = [Lessons(), Lessons(), Lessons()]
        i = -1
        for line in lines:
            line = line.replace("\n", "")
            line = line.replace("  ", "")
            if re.fullmatch(r"\s*subject\d:", line) is not None:
                i += 1
            elif line.count("timetable") != 1:
                subjects[i] = self.parser(line, subjects[i])
        #schedule = Timetable(subjects)
        return schedule


class Lessons:
    def __init__(self):
        self.day = None
        self.time = None
        self.room = None
        self.lesson = None
        self.teacher = None
        self.location = None
        self.parity = None


file = open("xml_lab3.xml", "r")
parser = TimetableParser()
schedule = parser.run(file)
xml = "<timetable>\n"
for i in range(len(schedule.subjects)):
    el = schedule.subjects[i]
    xml += "\t<subject{}>\n".format(i + 1)
    sub_dict = schedule.subjects[i].__dict__
    for p in sub_dict:
        xml += "\t\t<{}>{}</{}>\n".format(p, sub_dict[p], p)
    xml += "\t</subject{}>\n".format(i + 1)
xml += "</timetable>"
print(xml)
