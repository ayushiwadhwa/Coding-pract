// --- Directions
// Write a function that accepts a string.  The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// --- Examples
//   capitalize('a short sentence') --> 'A Short Sentence'
//   capitalize('a lazy fox') --> 'A Lazy Fox'
//   capitalize('look, it is working!') --> 'Look, It Is Working!'

function capitalize(str) {
  let result = str.charAt(0).toUpperCase();
  for(let i = 1; i <str.length; i++){
    if(str.charAt(i-1)===' '){
      result = result + str.charAt(i).toUpperCase();
    }
    else{result = result + str.charAt(i);}
  }
  return result;
}

module.exports = capitalize;

// function capitalize(str) {
//   const words = [];
//
//   for(let word of str.split(' ')){
//     words.push(word[0].toUpperCase() + word.slice(1));    //1st element hata ker baaki de do (2,4) 2nd se chalu ker k 4-1 element de do
//   }
//   return words.join(' ');
// }
