import icon from '../../assets/img/NewTux.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={icon} alt="DSMeta" />
                    <h1>DSMeta</h1>
                    <p>Desenvolvido por someone</p>
            </div>
        </header>
    )
}

export default Header