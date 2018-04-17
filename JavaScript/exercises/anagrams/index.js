// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False

//const word = "Hi There!!!!";
//word.replace(/[^\w]/g,""); =>HiThere

//Object obj = {
// a:1;
// b:1;
// c:1;
//};
//Object.keys(obj); => (a,b,c)

function anagrams(stringA, stringB) {
  return cleanString(stringA) === cleanString(stringB);
}
function cleanString(str){
  return str.replace(/[^\w]/g,'').toLowerCase().split('').sort().join('');
}
module.exports = anagrams;



// function anagrams(stringA, stringB) {
//   let aCharMap = buildCharMap(stringA);
//   let bCharMap = buildCharMap(stringB);
//
//   if(Object.keys(aCharMap).length !== Object.keys(bCharMap).length){
//     return false;
//   }
//   for(let char in aCharMap){
//     if(aCharMap[char] !== bCharMap[char]){
//       return false;
//     }
//   }
//   return true;
// }
//
// function buildCharMap(str){
//   let charMap = {};
//   for(let char of str.replace(/[^\w]/g,'').toLowerCase()){
//     if(charMap[char] == null){
//       charMap[char] = 1;
//     }
//     else {
//       charMap[char] = charMap[char] + 1;
//     }
//     //charMap[char] = charMap[char] + 1 || 1;
//   }
//   return charMap;
// }
