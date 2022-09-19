<script>
	let inpId;
	let age;
    let sex;
    let diagnosis

	
	const submitForm = async () => {
		const submit = await fetch('http://localhost:8080/patient/add-patient', {
			method: 'POST',
            headers: {
             'Content-Type': 'application/json'
            },
			body: JSON.stringify({
				inpId: inpId,
				age: age,
                sex: sex,
                diagnosis: diagnosis
			}),
		});
		
        console.log(submit);

	}
</script>

<div class="container">
    <h3 class="h3-st pad">Patient hinzufügen</h3>

        <form on:submit|preventDefault={submitForm}>

            <div class="mb-3">
                <label for="" class="form-label">
                    id:
                    <input type="text" name="inpId" class="inp-st" bind:value={inpId} /> 
                </label>
            </div>  

            <div class="mb-3">
                <label for="" class="form-label">
                    Alter:
                    <input type="text" name="age" class="inp-st" bind:value={age} /> 
                </label>
            </div>

            <div class="mb-3">
                <label for="" class="form-label">
                    Diagnose:
                    <input type="text" name="age" class="inp-st" bind:value={diagnosis} /> 
                </label>
            </div>

            <div class="mb-3">
                <label for="" class="form-label g-st">
                    Geschlecht:
                    <input type="text" name="sex" class="inp-st" bind:value={sex} /> 
                </label>
            </div>
            <div class="buttons row">
                <div class="box-1">
                    <a href="/analysis">
                        <button  type="button" class="btn btn-secondary">Zurück</button>
                    </a>
                </div>
                <div class="box-2">
                    <input type="submit" value="Bestätigen" class="submit-st"/>
                </div>
            </div>

        </form>
</div>


<style>
.h3-st {
    margin-bottom: 4rem;
    font-weight: 700;
    font-size: 35px;
    color: #073944;
}
.submit-st{
    background-color: #073944;
    border-color: #073944;
    color: #EFF4F7;
    border-radius: 80px;
    font-size: 1.3rem;
    padding: 0.2rem 1.9rem 0.2rem 1.9rem;  
    border-style: hidden; 
}
.form-label{
    color: #073944;
    font-size: 1.3rem;
}
.inp-st{
    background: rgba(239, 244, 247, 0.6);
    border-radius: 10px;
    border-style: hidden !important;
}
.btn-secondary {
    background-color: #073944 ;
    border-color: #073944 ;
}
.btn{
    border-radius: 80px;
    padding: 0.2rem 2.8rem 0.2rem 2.8rem;
    font-size: 1.3rem;
    color: #EFF4F7;
    border-style: hidden !important;
}
.mb-3 {
    margin-bottom: 2rem!important;
}
.box-1{
    flex: 4;
    margin-bottom: 1rem;
}
.box-2{
    flex: 13;
    padding-top: 0.1rem;
    padding-bottom: 9rem;
}
</style>