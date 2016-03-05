/*

Taylor Veith

pulls compound chemical formula, name(s), and CAS identifiers from https://en.wikipedia.org/wiki/Dictionary_of_chemical_formulas

compound details available at "http://www.chemexper.com/search/cas/" + element.CAS + ".html"

@TODO fetch more compound details (using CAS?)

*/

var letters = document.getElementsByClassName("wikitable sortable jquery-tablesorter"); // tables representing each letter
var elements = []; // declare array to house elements
var tsv = "";

// iterate over each letters table
for(var letter = 0; letter < letters.length; letter++) {

  // iterate over each row in the table
  for(var row = 0; row < letters[letter].tBodies[0].rows.length; row++) {

    // each column represented by a td but index is static
    var tds = letters[letter].tBodies[0].rows[row].getElementsByTagName("td");

    var element;

    // some elements have isomers - if this is the case, a row will be missing.
    if(tds.length == 3) {
      element = {
        "formula":tds[0].innerText.split("\n")[0],
        "names":tds[1].innerText.split("\n"), // multiple names possible, separated by newlines
        "CAS":tds[2].innerText
      };
    } else if(tds.length == 2) { // in case of isomer, use the formula of the previous element but update the names and CAS
      element = {
        "formula":elements[elements.length - 1].formula,
        "names":tds[0].innerText.split("\n"), // multiple names possible, separated by newlines
        "CAS":tds[1].innerText
      };
    } else {
      console.log("error. last element: " + elements[elements.length - 1].CAS)
    }

    // push element to the array
    elements.push(element);
    tsv += element.formula + "\t" + element.names.join(",") + "\t" + element.CAS + "\n";
  }
}

//console.log(JSON.stringify(elements, null, " ")); // formatted JSON object
//console.log(JSON.stringify(elements)); // unformatted JSON object
console.log(tsv); // tab separated format for excel