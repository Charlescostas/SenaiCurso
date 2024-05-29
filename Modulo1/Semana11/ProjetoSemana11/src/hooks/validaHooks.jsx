import { useState, useEffect, useRef } from "react"

export function ValidarForm() {
    const [data,setData] = useState({
        email: '',
        senha: '',
        idade: '',
    })
    const mensagemRef = useRef(null)
    const [mensagem, setMensagem] = useState("Preencha todos os campos")

    function handleSubmit() {
        if(data.email === "" || data.senha === "" || data.idade==="") {
            alert("Preencha os campos obrigatórios")
            return;
        }
    }

    useEffect(() => {
        const valores = Object.values(data)
        const totalPreenchido = valores.reduce((total, valor) => {
            if(valor.length > 3) {
                total += 1
            }
            return total
        }, 0)
 
        if(totalPreenchido === 3) {
            console.log('aaa')
            setMensagem("Parabéns, todos os valores preenchidos!")
            mensagemRef.current.style.background = "rgba(0,255,0, 0.183)"
        }
        else {
            console.log('bbb')
            setMensagem("Preencha todos os campos")
            mensagemRef.current.style.background = 'rgba(255, 157, 0, 0.183)'
        }
    }, [data])

    return {
        data,
        setData,
        mensagem,
        handleSubmit,
        mensagemRef,
    }
}