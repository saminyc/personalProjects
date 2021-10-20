# personalProjects
All of my own projects

Create a class called Date212 to represent a date. It will store the year, month and day as integers so 
you will need three private instance variables. One constructor should be provided that takes a String 
representing the date in yyyymmdd format. The constructor should use the substring method of class 
String to pull out the month, day and year, parse them as integers put them in the instance variables. 
The Date212 class should have the usual set and get methods, and equals, compareTo and 
toString methods. The toString method should print the date in “mm dd, yyyy” format (for example, 
20211002 would be returned as “October 2, 2021”.

                        Sorting an Array of Dates/ Displaying in a GUI
                        
Given an input file of dates represented as Strings, read the dates from the file and display them in a
GUI. The dates will be in the form yyyymmdd (such as 20211001 for October 1, 2021). The GUI should 
have a GridLayout with one row and two columns. The left column should display the dates in the 
format read from the file, and the right column should display the dates as Date212 object in sorted 
order (using Selection Sort).

The input file:
Each line of the input file may contain several dates separated by commas. You will need to use a 
StringTokenizer to separate out the individual dates. So, an example of the input file would be:
20141001
20080912,20131120,19980927
20210202
20200104
