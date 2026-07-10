## 2026-07-10 - Functional Blockers in Legacy JSF
**Learning:** Legacy XHTML files often contain subtle functional bugs like variable mismatches (`var="e"` vs `#{et.nom}`), case-sensitive method reference errors (`addEtudiant` vs `AddEtudiant`), and malformed HTML (`<h.form>`) that block UX improvements.
**Action:** Always perform a full structural audit of legacy JSF/PrimeFaces files before applying UX enhancements to ensure the underlying functionality is sound.
