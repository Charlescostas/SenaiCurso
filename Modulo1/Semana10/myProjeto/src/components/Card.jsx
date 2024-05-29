import PropsTypes from 'prop-types'

export function Card({titulo, descricao, valor }) {
    return (
        <div className='container'>
            <div>
                <strong>{titulo}</strong>
                <p>{descricao}</p>

                <div>
                    <span>{valor} Reais</span>
                </div>
            </div>
        </div>
    )
}

Card.propTypes = {
    titulo: PropsTypes.string.isRequired,
    descricao: PropsTypes.string,
    valor: PropsTypes.number,
}