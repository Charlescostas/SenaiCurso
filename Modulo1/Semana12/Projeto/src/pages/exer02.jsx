import { ButtonGoogle } from '../components/atoms/buttonGoogle'
import { ButtonLinkedin } from '../components/atoms/buttonLinkedin'
import { ButtonNormal } from '../components/atoms/buttonNormal'
import styles from './style.module.css' 

export function Exer02(){

    return (
        <div className={styles.container}>
            <form>
                <ButtonNormal>Normal</ButtonNormal>
                <br/>
                <ButtonGoogle>Google</ButtonGoogle>
                <br/>
                <ButtonLinkedin>Linkedin</ButtonLinkedin>             
            </form>
        </div>
    )

}