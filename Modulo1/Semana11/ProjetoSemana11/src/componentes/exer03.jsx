import { useState } from "react"
import { Input } from "./Input"
import { Button } from "./Button"
import { ListaItem } from "./ListaItem"

export function Exer03 (){
    const [texto, setTexto] = useState("")
    const [lista, setlista] = useState([]) 
    
    function addLista(){
        setlista(prevLista => {
            var novaLista = [...prevLista, texto]
      
            return novaLista
          })
          // LIMPAR O TEXTO DO INPUT
          setTexto('')
    }

    return (
        <div>
            <Input 
                type="text"
                value={texto} 
                onChange={(event) => setTexto(event.target.value)} 
            />
            
            <br/>
            <br/>

            <Button onClick={addLista}>Clique Aqui</Button>

            <br/>
            <br/>

            <ul>
                {
                  lista.map((interesse, index) => (
                    <ListaItem 
                      key={index} 
                      title={interesse} 
                    />
                  ))
                }
            </ul>
        </div>
    )
}