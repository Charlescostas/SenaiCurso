import { useState } from 'react';
import styles from './style.module.css' 
import { Button, FormControl, InputLabel, MenuItem, Select, TextField } from "@mui/material"

export function Exer03(){
    const [age, setAge] = useState('');

    const handleChange = (event) => {
      setAge(event.target.value);
    };

    return (
        <div className={styles.container}>
            <FormControl margin='normal'>
                <InputLabel id="demo-simple-select-label" margin='normal'>Age</InputLabel>
                <Select
                    labelId="demo-simple-select-label"
                    id="demo-simple-select"
                    value={age}
                    label="Age"
                    onChange={handleChange}
                >
                    <MenuItem value={10}>Ten</MenuItem>
                    <MenuItem value={20}>Twenty</MenuItem>
                    <MenuItem value={30}>Thirty</MenuItem>
                </Select>
                <TextField id="outlined-basic" label="Digite um Texto" variant="outlined" margin='normal' />            
                <Button variant="contained" onClick={() => alert('Aqui')} >Clicar</Button>
            </FormControl>            
        </div>
    )

}