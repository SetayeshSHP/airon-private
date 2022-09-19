<script>
    import MultiSelect from 'svelte-multiselect'
   
    const ui_libs = [`Methode 1`, `Methode 2`, `Methode 3`, `Methode 4`, `...`]
   
   let selected = []
  
   let uploadFilePromise;
    function uploadFile(e) {
        const file = e.target.files[0];
    }
   
   /* 
   **Lösung 1 : gehört zu bild dass wir von figma genommen und ich if reingepackt**
   */
   
   let  fileinput,name;	
   const onFileSelected =(e)=>{
   let image1 = e.target.files[0];
               let reader = new FileReader();
               reader.readAsDataURL(image);
               reader.onload = e => {
                    avatar = e.target.result
                    name = image1.name
               };
   }
  /*
   
   **Lösung 2 :wir haben von add-patientb genommen und biss verändert**

    let file;
    const formData = new FormData();

	const submitForm = async (file) => {
        
        formData.append('file', file)
		const submit = await fetch('http://localhost:8080/upload/image', {
			method: 'POST',
            headers: {
                'Content-Type':'multipart/form-data; boundary=---------------------------7da24f2e50046'
            },
			body:{
				file : formData
            },
		});
		
        console.log(submit);

	}

    **Lösung 3 : https://dev.to/brunooliveira/uploading-a-file-svelte-form-and-springboot-backend-18m6 **

    let files;
    let dataFile = null;


    function upload(value) {
        const formData = new FormData();
        formData.append('damName', value);
        formData.append('dataFile', files[0]);
        const upload = fetch('http://localhost:8080/upload/image', {
            method: 'POST',
            headers: {
                'Content-Type':'multipart/form-data; boundary=---------------------------7da24f2e50046'
            },
            body: formData
        }).then((response) => response.json()).then((result) => {
            console.log('Success:', result);
        })
                .catch((error) => {
                    console.error('Error:', error);
                });
    } 
   
*/
   </script>
   
   
   <div class="container">
       <h3 class="h3-st pad">Analyse starten</h3>
   
       <div class="mb-3">
           <label for="disabledSelect" class="form-label">Patient</label>
           <select class="form-select" aria-label="Default select example">
               <option selected>Patient auswählen</option>
               <option value="1">Patient 1</option>
               <option value="2">Patient 2</option>
             </select>
       </div>
   
       <h6 class="h6-st">Methode</h6>
       <MultiSelect bind:selected
        options={ui_libs} 
        noOptionsMsg= "keine Methode mehr"
        placeholder="Methode auswählen"/>
   
   


       
            
            <!--gehört zu Lösung 1**-->
            

        {#if name}
        {name}
        {:else}
        <img class="upload" src="/bildHochladen.svg" alt="" on:click={()=>{fileinput.click();}} />
        {/if}
                <!--
                   <form method="POST" enctype="multipart/form-data">
                    <input type="file" name="file"><br>
                    <input type="submit" value="Upload">
                </form>
            

            *
            **gehört zu Lösung 2**
            *
                <form on:submit|preventDefault={submitForm}>
                    <label for="">
                        image:
                        <input type="file" name="file" bind:value={file} /> 
                    </label>
                    <input type="submit" />
                </form>

            
            *
            **Lösung 3**
            *
            <input id="fileUpload" type="file" bind:files>

            {#if dataFile && files[0]}
                <p>
                {files[0].name}
                </p>
            {/if}

            <button on:click={upload}>Submit</button>   
            -->


            <!--
            {#if value}
                <button on:click={upload}>Submit</button>
            {:else}
                <button on:click={upload} disabled>Submit</button>
            {/if}
            -->
            <button class="btn button-appearance btn-secondary" on:click={upload}>Submit</button>
        </div>
   
   <style>
   
   .h3-st {
       margin-bottom: 1.6rem;
       font-weight: 700;
       font-size: 35px;
       color: #073944;
   }
   .btn-secondary {
       background-color: #073944 ;
       border-color: #073944 ;
   }
   .btn{
       border-radius: 100px;
   } 
   .button-appearance{
       padding: 0.3rem 3rem 0.3rem 3rem;
       margin-top: 1rem;
   }
   .h6-st{
       color: #073944;
       font: 16px;
   }
    
   .upload{
       display:flex;
       cursor:pointer;
       padding-bottom: 1rem;
       padding-top: 1rem;
       max-width: 26rem;
   }
   /*
   .appearance{
       height: 50%;
       width: 35%;
   }*/
   .form-select {
       border-radius: 0.8rem;
       background-color: rgba(239, 244, 247, 0.6);
       color: rgba(7, 57, 68, 0.5);
       height: 45%;
       width: 45%;
   }
   .form-label{
       color: #073944;
   }
   :global(div.multiselect input::placeholder) {
       color: rgba(7, 57, 68, 0.5);
       padding: 0.1rem;
   }
   :global(div.multiselect){
       padding: 0.375rem 2.25rem 0.375rem 0.75rem;
       border-radius: 0.8rem;
       background-color: rgba(239, 244, 247, 0.6);
       width: 45%;
   }
   :global(div.multiselect input){
       padding: 0.2rem;
   }
   @media (max-width: 991.98px) {
       .upload{
           max-width: 19rem;
       }
    }
    @media (max-width: 767.98px) { 
       .upload{
           max-width: 15rem;
       }
   }
   </style>