// --- Directions
// Write a function that returns the number of vowels
// used in a string.  Vowels are the characters 'a', 'e'
// 'i', 'o', and 'u'.
// --- Examples
//   vowels('Hi There!') --> 3
//   vowels('Why do you ask?') --> 4
//   vowels('Why?') --> 0

//word.includes("o");
function vowels(str) {
  const matches = str.match(/[aeiou]/gi); //g do not stop at first instance i case insensitive. It returns an array if match found else null.
  return matches ? matches.length : 0;
}

module.exports = vowels;

// function vowels(str) {
//   let count = 0;
//   const checker = ['a','e','i','o','u'];
//
//   for(let char of str.toLowerCase()){
//     if(checker.includes(char)){
//       count++;
//     }
//   }
//   return count;
// }
