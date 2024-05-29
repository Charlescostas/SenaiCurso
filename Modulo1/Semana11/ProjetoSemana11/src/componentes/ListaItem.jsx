import PropTypes from 'prop-types'

export function ListaItem({ title }) {
    return (
        <li>
            {title}
        </li>
    )
}

ListaItem.propTypes = {
    title: PropTypes.string.isRequired,
    onRemove: PropTypes.func.isRequired,
}