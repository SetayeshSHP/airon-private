<script>
export let patients
</script>


<div class="container">
    <h3 class="h3-st">Patientenliste</h3>
    <div class="col-md-6">
        <ol class="list-group list-group-numbered">
            {#each patients as patient}
            <li class="list-group-item d-flex  align-items-start">
                <p class="card-text">{patient.inpId}</p> 
            </li>
            {/each} 
        </ol> 
    </div>
</div>

<style>
.h3-st {
    margin-bottom: 4rem;
    font-weight: 700;
    font-size: 35px;
    color: #073944;
}
</style>