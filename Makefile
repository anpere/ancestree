family:
	java -jar family.jar
	dot -Tpng family.gv -o family.png
	convert family.png family.pdf
	open family.pdf
