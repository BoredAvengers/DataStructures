import React, { Component } from 'react';


var buttonStyle = {
    margin: '10px 10px 10px 0'
  };

export default class GenericButton extends Component{
      
    render(){
        return(
           <div className="genricButton">
             <button className="btn btn-default" style={buttonStyle} onClick={this.props.handleClick}>{this.props.label}
        </button>
           </div>
        )
    }
}


  