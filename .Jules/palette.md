## 2026-08-10 - [Avoid Escaping Syntax Issues in HTML Onclick]
**Learning:** Embedding French single quotes like in "l'etudiant" within single-quoted HTML/XML attributes triggers JS syntax issues and parsing errors if not escaped. Switching the phrasing to single-quote-free alternatives like "cet etudiant" or similar eliminates escaping bugs completely, ensuring a robust confirmation experience.
**Action:** Always verify single-quote escaping inside inline event handler strings such as 'onclick' and prefer phrasing without single quotes when feasible to guarantee bug-free user interaction.
