import PropTypes from 'prop-types'
import styles from './button.module.css'

export function ButtonNormal({ children, ...rest }) {
    return <button className={styles.button} {...rest}>{children}</button>
}

ButtonNormal.propTypes = {
    children: PropTypes.node,
}
