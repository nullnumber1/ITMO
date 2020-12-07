import xmltodict
import json

with open('xml_lab3.xml') as fd:
    doc = xmltodict.parse(fd.read())
print(json.dumps(doc, indent=2))
