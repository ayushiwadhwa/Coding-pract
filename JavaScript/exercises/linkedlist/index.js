// --- Directions
// Implement classes Node and Linked Lists
// See 'directions' document

class Node {
  constructor(data, next = null){
    this.data = data;
    this.next = next;
  }
}

class LinkedList {
  constructor(){
    this.head = null;
  }
  //insertFirst is just used used to add a node in front of the list.
  //if the list already have some nodes in it then we have to shift them
  //to make space for the new one so we pass this.head as a reference to
  //the next property of new node. Now since the new node will be the head
  //node of the LinkedList we adjust that too.
  insertFirst(data){
    //this.head = new Node(data, this.head);
    this.insertAt(data,0);
  }

  size(){
    let counter = 0;
    let node = this.head;
    while(node){
      counter++;
      node = node.next;
    }
    return counter;
  }

  getFirst(){
    //return this.head;
    return this.getAt(0);
  }

  getLast(){
    // if(!this.head){
    //   return null;
    // }
    // let node = this.head;
    // while(node){
    //   if(!node.next){
    //     return node;
    //   }
    //   node = node.next;
    // }
    return this.getAt(this.size() - 1);
  }

  clear(){
    this.head = null;
  }

  removeFirst(){
    // if(!this.head){
    //   return null;
    // }
    // this.head = this.head.next;

    this.removeAt(0);
  }

  removeLast(){
    // if(!this.head){
    //   return;
    // }
    // if(!this.head.next){
    //   this.head = null;
    //   return;
    // }
    // let previous = this.head;
    // let node = this.head.next;
    // while(node.next){
    //   previous = node;
    //   node = node.next;
    // }
    // previous.next = null;

    this.removeAt(this.size() - 1);
  }

  insertLast(data){
    // const last = this.getLast();
    // if(last){
    //   //there exist some node in the chain
    //   last.next = new Node(data);
    // }
    // else{
    //   this.head = new Node(data);
    // }
    this.insertAt(data, this.size());
  }

  getAt(index){
    let counter = 0;
    let node = this.head;
    while(node){
       if(counter === index){
         return node;
       }
       counter++;
       node = node.next;
    }
    return null;
  }

  removeAt(index){
    if(!this.head){
      return;
    }

    if(index === 0){
      this.head = this.head.next;
      return;
    }

    const previous = this.getAt(index - 1);
    if(!previous || !previous.next){ //previous.next when the index we remove
                                    //is one greater than the length of list i.e previous.next is actually a last node.
      return;
    }
    previous.next = previous.next.next;
  }

  insertAt(data,index){
    if(!this.head){
      this.head = new Node(data);
      return;
    }
    if(index === 0){
      this.head = new Node(data, this.head); //insert the new node at index 0
                                              //then point it to the exiting list.
      return;                                        //so in the args this.head is passed.
    }
    const previous = this.getAt(index - 1) || this.getLast();

    const node = new Node(data, previous.next);
    previous.next = node;
  }

  *[Symbol.iterator](){
    let node = this.head;
    while(node){
      yield node;
      node = node.next;
    }
  }
}

module.exports = { Node, LinkedList };
