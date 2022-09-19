<script>

    import { Confirm } from 'svelte-confirm'

    function deleteItem (itemId) {
    // ...
    }
  export let analysismethods

</script>
<div class="container"> 
    <h3 class="h3-st pad">Darstellung</h3>
<div class="section" style="padding-bottom: 2rem;">
    <table class="table container table-striped">
      <thead>
        <tr>
          <th scope="col" class="font-style" style="width: 15%;">Name</th>
          <th scope="col" class="font-style" style="width: 15%;">Type</th>
          <th scope="col" class="font-style" style="width: 15%;">Aktionen</th>
        </tr>
      </thead>
        <tbody>
            {#each analysismethods as analysismethod}
            <tr>
                  <td>{analysismethod.name}</td>
                  <td>{analysismethod.type}</td>
                  <td class="center-st">
                      <a href="/analysis/start-analysis"> <img src="/startAnalysis.svg" alt="start-analysis" class="img-style"> </a>
                      <a href="/analysis/add-patient" > <img src="/edit.svg" alt="bearbeiten" class="img-style"> </a>
                      <Confirm
                        let:confirm="{confirmThis}"
                      >
                      <button on:click="{() => confirmThis(deleteItem, item.id)}" class="button-s"> <img src="/delete.svg" alt="löschen" class="img-style"></button>
                    </Confirm>
                  </td>
            </tr>
            {/each}      
        </tbody>
    </table>
</div>
<div class="buttons">
    <div class="box-1">
        <a href="/analysis">
            <button  type="button" class="btn btn-secondary">Zurück</button>
        </a>
    </div>
</div>
</div>
<style>
.table{
    margin-top: 2em;
    width: 75%;
}

.h3-st {
    margin-bottom: 4rem;
    font-weight: 700;
    font-size: 35px;
    color: #073944;
}
.font-style{
    color: rgb(7, 57, 68);
    font-size: 1rem;
    text-align: center;
    font-weight: 400;
}
th{
    width: 20%;
    text-align: center;
}
td{
    width: 20%;
    text-align: center;
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
.box-1{
    padding-bottom: 7rem;
    padding-left: 10rem;
}
.img-style{
    width: 2rem;
    padding: 0.3rem;
}
.button-s{
    border: hidden;
    background-color: inherit;
}
.center-st{
    white-space: nowrap;
}
@media (max-width: 1199.98px) { 
    .box-1{
    padding-bottom: 7rem;
    padding-left: 8rem;
}
}
@media (max-width: 991.98px) { 
    .box-1{
    padding-bottom: 7rem;
    padding-left: 6rem;
} 
}
@media (max-width: 767.98px) { 
    .box-1{
    padding-bottom: 7rem;
    padding-left: 4rem;
} 
}
@media (max-width: 575.98px) { 
    .box-1{
    padding-bottom: 7rem;
    padding-left: 0;
}  
}
</style>