import { useEffect, useState } from "react"

export function Input () {
    const [texto, setTexto] = useState("")
 
    useEffect(() => {
        async function getPegaNoticia() {
            var response = await fetch('https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release')
            var data = await response.json()
            
            setTexto(data.items[0].titulo)
        }
        getPegaNoticia();
    }, []);

    return (
        <div>
            <p>{texto}</p>
        </div>
    )
}
