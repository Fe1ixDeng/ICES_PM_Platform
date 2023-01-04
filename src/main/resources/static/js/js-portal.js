function setSubmit() {
    switch (document.getElementById("algo").value){
        case "select":
            window.alert("Please choose an Algorithm!");
            break;
        case "aAlgorithm":
            document.getElementById("defaultDisplay").src = "ices_pm_alphaalgorithm/ices_pm_alphaalgorithm_portal.html";
            break;
        case "HeuristicMining":
            document.getElementById("defaultDisplay").src = "ices_pm_hm/ices_pm_hm_portal.html";
            break;
        case "InductiveMining":
            document.getElementById("defaultDisplay").src = "ices_pm_im/ices_pm_im_portal.html";
            break;
        case "VSPM":
            document.getElementById("defaultDisplay").src = "ices_pm_vspm/ices_pm_vspm_portal.html";
            break;
    }
}
function selectFile() {

}