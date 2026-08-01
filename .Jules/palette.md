## 2026-08-01 - Proper JSF Form Separation and Row Accessibility

**Learning:** Separating JSF/PrimeFaces layouts into independent sibling forms (`formListe` and `formAjout`) is crucial for preventing nested form compilation or runtime lifecycle errors. Inside data tables, using the `a:` passthrough namespace with `a:aria-label` allows dynamic context (e.g., student name) to be announced to screen readers for row-bound actions like modifier/supprimer.

**Action:** When working on legacy JSF pages, always check for illegal nested `<h:form>` tags or invalid tags like `<h.form>`. Ensure all inputs are mapped to `p:outputLabel` via `for` attributes and provide `a:aria-label` attributes with specific row-bound variables inside tables.
