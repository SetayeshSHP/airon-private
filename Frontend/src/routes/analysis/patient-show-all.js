export async function get() {
    const res = await fetch('http://localhost:8080/patient/get-all-patients');
    const patients = await res.json();

    if (res.ok) {
        return {
         body: { patients }
        };
    }
    return {
      status: res.status,
      error: new Error('Could not fetch the patient')
    };
}