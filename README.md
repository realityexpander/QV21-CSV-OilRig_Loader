# QV21

This app load a CSV file and displays the records in a list.
Clicking on the list will open a new activity that allows you to edit those fields.
You can then save your edits by tapping the Save button, or return to the previous 
screen and leave the data untouched.

Written by Chris Athanas for QV21

Requirements

* Load the data file into memory (whatever construct you choose)
* Display a grid containing Owner, Lease/Well Name, Tank Name, Tank Nbr
* Allow drilling down into a row to edit all fields
* This can be done by expanding the row or opening another fragment containing the information

_Note:_ you do not need to store data back to the file, so simply editing in memory is sufficient.)
Be able to return to the main grid, showing any updated information if applicable


Got hung up on several minor issues:
  - Subclassed sample code kept private storage and did not subclass all methods that access data.
  - Samsung phones have special option to make USB available.
  - Off-by one with UI elements.
  
