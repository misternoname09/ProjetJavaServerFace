## 2025-05-15 - Escaping Quotes in JSF JavaScript Attributes
**Learning:** In JSF components, JavaScript in attributes like `onclick` can fail if single quotes in text (common in French, e.g., "l'étudiant") are not properly escaped. This can break critical interactions like delete confirmations.
**Action:** Always escape single quotes in JavaScript strings within JSF attributes or use double quotes for the JavaScript string itself if the attribute uses single quotes, ensuring French text doesn't break the script.

## 2025-05-15 - Proper Property Binding in PrimeFaces DataTables
**Learning:** The `var` attribute in `p:dataTable` defines the iteration variable. Accessing properties using a different variable name (e.g., `et` instead of `e`) or incorrect case (e.g., `dateNais` instead of `datenaiss`) leads to empty columns or EL errors.
**Action:** Cross-reference the `var` attribute with the property accessors in the column components to ensure perfect matches with the underlying Java Bean properties.
