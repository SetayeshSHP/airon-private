export async function get() {
    const res = await fetch('http://localhost:8080/analysismethod/get-all-methods');
    const analysismethods = await res.json();

    if (res.ok) {
        return {
         body: { analysismethods }
        };
    }
    return {
      status: res.status,
      error: new Error('Could not fetch the patient')
    };
}