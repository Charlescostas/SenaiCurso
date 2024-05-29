import { ListaBasica } from "./lista"
import { Button} from "./components/Button"
import { Card } from "./components/Card"
import { Input } from "./components/Input"

function App() {
  return (
      <div>
        <Card 
          titulo='Carro' 
          descricao="SUV - SW4" 
          valor={382000}
        />        
        <Button></Button>
        <br/>
        <br/>
        <ListaBasica />
        <br/>
        <br/>

        <Input value={'[M1S10] EX 5' } isActive={false} />

      </div>
  )
}
export default App