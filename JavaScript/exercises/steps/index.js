// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'

function steps(n, row = 0, stair = '') {
  if(n === row){  //1st identify the base condition
    return;
  }
  if(n===stair.length){  //when do you want to actually print the output.
    console.log(stair);
    return steps(n, row + 1); //recurssing at the end of the row.
  }
  if(stair.length <= row){ //what you actually want to show logic
    stair += '#';
  }
  else{
    stair += ' ';
  }
  steps(n,row,stair); //recurssing through the row as well
}

module.exports = steps;

// function steps(n) {
//   for(let row = 0; row < n; row++){
//     let stair = '';
//     for(let col = 0; col<n; col++){
//       if(col <= row){
//         stair += '#';
//       }
//       else{
//         stair += ' ';
//       }
//     }
//     console.log(stair);
//   }
// }
