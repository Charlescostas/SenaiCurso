import lista from './data.json'
import PropsTypes from 'prop-types'

export function ListaBasica() {
    return (
        <ul>
            {lista.map(interesse => <li key={interesse.id}>{interesse.nome}</li>)}
        </ul>
    )
}

lista.propTypes = {
    id: PropsTypes.number.isRequired,
    nome: PropsTypes.string.isRequired,
    description: PropsTypes.string,
}