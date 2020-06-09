import React, { Component } from 'react';
//class component
export default class FirstComponent extends Component{
    render(){
      return (
        <div className = "firstcompnent">
          My First Component new Folder.
        </div>
      )
    }
    
  }

  //class component
export  class SecondComponent extends Component{
    render(){
      return (
        <div className = "secondcompnent">
          My Second Component in First Component.
        </div>
      )
    }
  }