import { useState } from "react"

export function InputControlado(){
    const [texto, setTexto] = useState("")

    return (
        <>      
            <strong>Meu input: {texto}</strong> 
            
            <br/>

            <input type="text" onChange={(event) => setTexto(event.target.value)} /> 
        </>     
    )   
}