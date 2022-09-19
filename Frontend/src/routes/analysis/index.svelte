
<script>

</script>

<div class="container">
    <h3 class="h3-st">Analyse</h3>
    <div class="row">
        <div class="col-md-6">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title h5-st"> Patient </h5>
               <a href="/analysis/patient-show-all" class="btn btn-link button-st-st">Alle anzeigen</a>
               <a href="/analysis/add-patient" class="btn btn-outline-secondary button-st a-st">hinzufügen</a>
            </div>
          </div>
        </div>

        <div class="col-md-6">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title h5-st">Analysemethode</h5>
                 <a href="/analysis/analysis-show-all" class="btn btn-link button-st-st">Alle anzeigen</a>
                 <a href="/analysis/add-analysis" class="btn btn-outline-secondary button-st a-st">hinzufügen</a>
          </div>
        </div>
      </div>
      <div class="button-lg">
        <a href="/analysis/start-analysis">
        <button  type="button" class="btn btn-secondary btn-lg btn-style">Analyse starten</button>
        </a>
      </div>
</div>

</div>
<style>
.h3-st {
    margin-bottom: 1.6rem;
    font-weight: 700;
    font-size: 35px;
    color: #073944;
}
.btn-outline-secondary {
    border-color: #073944 ;
}
.a-st {
    color: #073944;
}
.h5-st {
    margin-left: 0.9rem;
    color: #073944;
    font-size: normal;
    font-weight: 500; 
}

.btn-secondary {
    background-color: #073944 ;
    border-color: #073944 ;
}
.btn-link{
    color: #073944;
}

.card{
    border: 1px solid #073944;
    border-radius: 0.8rem;
}

.card-body{
    height: 10rem;
}

.btn{
    border-radius: 100px;
}

@media (min-width: 768px){
.col-md-6
{
    padding-bottom: 3rem;
}}

.row{
    --bs-gutter-y: 1rem;
}
@media (max-width: 767.98px) { 
    .button-lg{
        padding-bottom: 10rem;
        padding-top: 3rem;
    }
 }
.card-title {
    margin-bottom: 1rem;
}
.button-st{
    position: absolute;
    right: 1rem;
    bottom: 1.7rem;
}

.button-st-st{
    position: absolute;
    bottom: 2rem;
}
.box-1{
    flex: 4;
}
.box-2{
    flex: 1;
}
.btn-secondary {
    background-color: #073944 ;
    border-color: #073944 ;
}
.btn{
    border-radius: 100px;
}  
</style>