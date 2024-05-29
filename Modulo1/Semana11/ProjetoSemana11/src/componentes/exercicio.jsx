import { useState} from "react"
import "./exercicio.css"

export function Exercicio() {
    const [contador, setContador] = useState(0)
 
    function retiraUm() {
      setContador((prevState) => {
        return prevState - 1
      })
    }
  
    function addUm() {
      setContador((prevState) => {
        return prevState + 1
      })
    }

    return (
        <div className="container">
            <button onClick={retiraUm}>
            -
            </button>

            <strong>{contador}</strong> <br />

            <button onClick={addUm}>
            +
            </button>
        </div>        
    )
}