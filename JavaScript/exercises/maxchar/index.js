// --- Directions
// Given a string, return the character that is most
// commonly used in the string.
// --- Examples
// maxChar("abcccccccd") === "c"
// maxChar("apple 1231111") === "1"

function maxChar(str) {
  let chars = {};
  let max = 0;
  let maxChar = '';
  for(let char of str){ //iterating through string or arrays we use of
    if(chars[char] == null){
      chars[char] = 1;
    }
    else{
      chars[char]++;
    }
  }
  //console.log(chars);
  for(let char in chars){ //iterating through objects we make use of in
    if(chars[char] > max){
      max = chars[char];
      maxChar = char;
    }
  }
  return maxChar;
}

module.exports = maxChar;
