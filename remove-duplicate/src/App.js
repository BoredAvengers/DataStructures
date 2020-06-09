import React, { Component } from 'react';
//import logo from './logo.svg';
import './App.css';
import FirstComponent,{SecondComponent} from './Component/Learning/FirstComponent';
import ThirdComponent from './Component/Learning/ThirdComponent';
import BracketSequenceInput from './Component/BracketSequenceInput';
import GenericButton   from './Component/GenericButton';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header>
          <form id = 'todo-form-id'>
                 <input type="text" placeholder="Enter the value"/>
                  <button type="submit">Add</button>
            </form>
          </header>
        </div>
      
      // <div className="App">
      //  {/* My Hello World. */}
      //  {/* <BracketSequenceInput></BracketSequenceInput> */}
      //  {/* <GenericButton></GenericButton> */}
      //  {/* <FirstComponent></FirstComponent> */}
      //  {/* <SecondComponent></SecondComponent> */}
      //  {/* <ThirdComponent></ThirdComponent> */}
      //  {/* <FourthComponent></FourthComponent> */}
      // </div>
     
    );
  }
}



function FourthComponent(){
  return(<div className = "fourthcomponent">
    My Fouth function Component.
  </div>

);
}

const UserInfo = function (){
  return (
<div>
  <p>Name: </p>
  <p>Age: </p>
</div>
  );
}

export default App;
//ReactDOM.render(<UserInfo />,document.getElementById('App'));
