import { ValidarForm } from "../hooks/validaHooks"

export function Exer04() {
    const { data, mensagem, setData, handleSubmit, mensagemRef } = ValidarForm()

    return (
        <div>
           <strong 
            ref={mensagemRef}
            style={{
                padding: 16,
                borderRadius: 5,
                minWidth: 500,
                display: 'block',
                background: 'rgba(255, 157, 0, 0.183)',
                marginBottom: 16
            }}
           >{mensagem}</strong>
           {}
            <input 
                type="email" 
                value={data.email} 
                onChange={event => {
                    setData(prevState => ({
                        ...prevState, 
                        email: event.target.value
                    }))
                }}
                placeholder="Seu e-mail" 
                autoComplete="off"
            /> 
            <br/ >
            <br/ >
                <input 
                    //onBlur={() => {
                    //    alert('saiu do foco')
                    //}}
                    type="senha" 
                    value={data.senha} 
                    placeholder="Sua senha"
                    onChange={event => {
                        setData(prevState => ({
                            ...prevState,
                            senha: event.target.value
                        }))
                    }}
                /> 
            <br />
            <br />
            <input 
                //onBlur={() => {
                //    alert('saiu do foco')
                //}}
                type="idade" 
                value={data.idade} 
                placeholder="Sua idade"
                onChange={event => {
                    setData(prevState => ({
                        ...prevState,
                        idade: event.target.value
                    }))
                }}
            /> 
            <br />
            <br />
            
            <button onClick={handleSubmit}>Submit</button>
        </div>
    )
}